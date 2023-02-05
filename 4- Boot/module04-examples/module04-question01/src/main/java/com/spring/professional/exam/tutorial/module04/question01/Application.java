package com.spring.professional.exam.tutorial.module04.question01;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.*;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;

import static org.springframework.http.HttpStatus.REQUEST_TIMEOUT;


public class Application  {

    static Log log = LogFactory.getLog(Class.class);

    public static void main(String[] args) throws Exception {

        try {
            throw new ResourceAccessException("Exception");
        }catch (ResourceAccessException e){
            if (e.getCause() instanceof SocketTimeoutException){
                log.error("SocketTimeoutException exception");
            }
            else if (e.getCause() instanceof ConnectionPoolTimeoutException){
                log.error("ConnectionPoolTimeoutException exception ");
            } else{
                log.error("ResourceAccessException exception "+e.getMessage());
            }


        }
//
//        log.warn("Logging Works");
//    //    System.setProperty("org.apache.http.impl.conn.PoolingHttpClientConnectionManager", "TRACE");
//
//        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
//        requestFactory.setConnectTimeout(500);
//        requestFactory.setReadTimeout(2000);
//        requestFactory.setConnectionRequestTimeout(2000);
//
////        CloseableHttpClient httpClients = HttpClients.custom()
////                .setMaxConnTotal(30)
////                .setMaxConnPerRoute(10)
////                .build();
//
//       // requestFactory.setHttpClient(httpClients);
//        RestTemplate restTemplate = new RestTemplate(requestFactory);
//
//        ///
////
////        RequestConfig requestConfig = RequestConfig.custom()
////                // setConnectionRequestTimeout timeout when requesting a connection from the pool
////                .setConnectionRequestTimeout(5000)
////                // timeout to establish a connection to the server (establish ssl connection)
////                .setConnectTimeout(500)
////                // timeout to start reading the data from the server
////                .setSocketTimeout(3000)
////                .build();
////
////         //worst scenario is that the request will wait 5000+500+3000 = 8500
////
////        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
////        CloseableHttpClient httpClients = HttpClients.custom()
////                .setMaxConnTotal(30)
////                .setMaxConnPerRoute(10)
////                .setDefaultRequestConfig(requestConfig).build();
////
////        requestFactory.setHttpClient(httpClients);
////        final RestTemplate restTemplate=new RestTemplate(requestFactory);
//        ///
//        CountDownLatch latch= new CountDownLatch(100);
//
//        for(int i=0 ; i<100;i++){
//            CompletableFuture.runAsync(() -> {
//
//                long t1=System.currentTimeMillis();
//                String response="";
//                try {
//                     response=restTemplate.getForObject("http://localhost:8081/plus-api/get",String.class);
//
//                }catch (ResourceAccessException e){
//                    if (e.getCause() instanceof SocketTimeoutException){
//                        log.error("SocketTimeoutException exception");
//                    }
//                    else if (e.getCause() instanceof ConnectionPoolTimeoutException){
//                        log.error("ConnectionPoolTimeoutException exception ");
//                    }
//
//                }
//            finally {
//                    long t2=System.currentTimeMillis();
//                    System.out.println("execute time for thread#"+Thread.currentThread().getId()+" = "+(t2-t1)+" , response="+response);
//                }
//
//            }).thenRun(latch::countDown);
//
//
//        }
//        latch.await();
//        System.out.println("finish....");

    }

}
