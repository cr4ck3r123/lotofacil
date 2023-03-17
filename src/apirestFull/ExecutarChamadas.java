/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apirestFull;

import apirestFull.ModelCaixa;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
//import java.lang.ProcessBuilder.Redirect.Type;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;
//import java.util.regex.Pattern;

/**
 *
 * @author Fernando
 */
public class ExecutarChamadas {

    //METODO PRINCIPAL DE INICIALIZAÇÃO
    public static void main(String[] args) throws UnsupportedEncodingException, IOException, JSONException {
       
        String urlParaChamada = "https://servicebus2.caixa.gov.br/portaldeloterias/api/lotofacil/";
        int codigoSucesso = 200;
        int concurso = 0;
         try {
           
            
            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            System.setProperty("javax.net.ssl.trustStore", "C:/.keystore");
            System.setProperty("javax.net.ssl.trustStorePassword", "changeit");

            if (conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());

            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
            String jsonEmString = Util.converteJsonEmString(resposta);

            Gson gson = new Gson();
            ModelCaixa caixa = gson.fromJson(jsonEmString, ModelCaixa.class);
            
            int sorteio = caixa.numero;
          // System.out.print(num_final);
           List<Integer> lista = new ArrayList<Integer>();
            for (int i = sorteio; i >= sorteio - 10; i--) { 
                 url = new URL(urlParaChamada+i);
                 conexao = (HttpURLConnection) url.openConnection();
                 resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
                jsonEmString = Util.converteJsonEmString(resposta);
                gson = new Gson();
                caixa = gson.fromJson(jsonEmString, ModelCaixa.class);
                
                System.out.printf("Sorteio: "+caixa.numero+" "+caixa.listaDezenas+" "+"\n");
               
                
                
                
            }
          
          
          
        } catch (Exception e) {
            System.out.print(e);
        }     
   
    //lista.add(resultadoCaixa);
    }

}

