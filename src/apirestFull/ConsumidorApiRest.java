/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apirestFull;

import apirestFull.ConsumidorApiRest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author Fernando
 */
public class ConsumidorApiRest {
    
    private static String URLBase = "http://loterias.caixa.gov.br/wps/portal/loterias/landing/lotofacil/!ut/p/a1/04_Sj9CPykssy0xPLMnMz0vMAfGjzOLNDH0MPAzcDbz8vTxNDRy9_Y2NQ13CDA0sTIEKIoEKnN0dPUzMfQwMDEwsjAw8XZw8XMwtfQ0MPM2I02-AAzgaENIfrh-FqsQ9wBmoxN_FydLAGAgNTKEK8DkRrACPGwpyQyMMMj0VAcySpRM!/dl5/d5/L2dBISEvZ0FBIS9nQSEh/pw/Z7_61L0H0G0J0VSC0AC4GLFAD2003/res/id=buscaResultado/c=cacheLevelPage//p=concurso=2391?timestampAjax=1638896541438";
    private static String token;
    
    private static ConsumidorApiRest instance;
    
    private CloseableHttpClient clienteHTTP;
    
    
    private ConsumidorApiRest(){
        this.clienteHTTP = HttpClients.createDefault();
    }
    
    static ConsumidorApiRest getInstance(){
        if (instance == null){
            instance = new ConsumidorApiRest();
        }
        return instance;
    }
    
    
    public void doLogin(String url){
        
        try {
            HttpPost httpPost = new HttpPost(url);
            
            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
                @Override
                public String handleResponse(
                        final HttpResponse response) throws ClientProtocolException, IOException {
                    int status = response.getStatusLine().getStatusCode();
                    if(status >= 200 && status < 300){
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                         throw new ClientProtocolException("Unexpected response status: "+ status); //To change body of generated methods, choose Tools | Templates.
                    }                   
                   
                }
            };            
       String responseBody = this.clienteHTTP.execute(httpPost, responseHandler);
       System.out.println("-----------------------------------------------------");
       System.out.println(responseBody);
        } catch (Exception e) {
            Logger.getLogger(ConsumidorApiRest.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
    
    
    public String doRequest(String path){
        String responseBody = null;
        
        try {
            HttpGet httpGet = new HttpGet(path);
            
            
            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
                @Override
                public String handleResponse(
                        final HttpResponse response) throws ClientProtocolException, IOException {
                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300){
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                    throw new ClientProtocolException("Unexpected response status: "+ status); 
                         }
                     }
            };
        responseBody = this.clienteHTTP.execute(httpGet, responseHandler);
        System.out.printf("\n");
        
        } catch (Exception e) {
             Logger.getLogger(ConsumidorApiRest.class.getName()).log(Level.SEVERE, null, e);
        }
        return responseBody;
     }
    
     
}
