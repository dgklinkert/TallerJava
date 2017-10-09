package restSes;
//
//  ========================================================================
//  Copyright (c) 1995-2017 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class MainApp extends AbstractHandler
{
    @Override
    public void handle( String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response ) throws IOException, ServletException
    {

        // Declare response status code
        response.setStatus(HttpServletResponse.SC_OK);
        // Inform jetty that this request has now been handled
        baseRequest.setHandled(true);
        
        if( request.getMethod() == "POST") 
        {

        	BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
            StringBuilder jsonString = new StringBuilder();
            if(br != null)
            {
				String line;
				// Obtiene todas las lineas del POST
				while( (line = br.readLine()) != null)
				{
				   jsonString.append(line);
				}
            }
            
            URL url = new URL("http://ip.jsontest.com/");
            HttpURLConnection peticion = (HttpURLConnection) url.openConnection();
            peticion.setRequestMethod("GET");
            peticion.connect();
    		
            int responseCode = peticion.getResponseCode();
            
    		if (responseCode == HttpURLConnection.HTTP_OK)
    		{ // success
    			BufferedReader in = new BufferedReader(new InputStreamReader(peticion.getInputStream()));
    			String inputLine;
    			StringBuffer responseGet = new StringBuffer();

    			while ((inputLine = in.readLine()) != null) 
    			{
    				responseGet.append(inputLine);
    			}
    			in.close();

    			// print result
    			System.out.println(responseGet.toString());
    			
    			response.setContentType("application/javascript; charset=utf-8");
    			response.getWriter().println(responseGet.toString());

    		}
    		else 
    		{
    		// Declare response encoding and types
	        response.setContentType("text/html; charset=utf-8");
			//  Respuesta por el metodo Get 
			response.getWriter().println("<h1>Middle Prototype !!</h1> : " +  request.getMethod());
    		}
        }
        
        if( request.getMethod() == "GET")
        {
        	URL url = new URL("http://ip.jsontest.com/");
            HttpURLConnection peticion = (HttpURLConnection) url.openConnection();
            peticion.setRequestMethod("GET");
            peticion.connect();
    		
            int responseCode = peticion.getResponseCode();
            
    		if (responseCode == HttpURLConnection.HTTP_OK)
    		{ // success
    			BufferedReader in = new BufferedReader(new InputStreamReader(peticion.getInputStream()));
    			String inputLine;
    			StringBuffer responseGet = new StringBuffer();

    			while ((inputLine = in.readLine()) != null) 
    			{
    				responseGet.append(inputLine);
    			}
    			in.close();

    			// print result
    			System.out.println(responseGet.toString());
    			
    			response.setContentType("application/javascript; charset=utf-8");
    			response.getWriter().println(responseGet.toString());
    		}
        }
        
        
        
        
        
        	
    }

    public static void main( String[] args ) throws Exception
    {
        Server server = new Server(8085);
        server.setHandler(new MainApp());
        server.start();
        server.join();
    }
}