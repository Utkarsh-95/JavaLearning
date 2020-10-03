package Thoughtworkstest;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.nio.charset.UnsupportedCharsetException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.json.JSONException;
import org.json.JSONObject;

public class ApacheHttpClientWithSSLConnectionSocketFactory {

    public static void main(String... args) {

        try {
            examplePost();
        } catch (NoSuchAlgorithmException | KeyManagementException ex) {
            Logger.getLogger(ApacheHttpClientWithSSLConnectionSocketFactory.class.getName()).log(Level.SEVERE,
                    null, ex);
        }

    }

    public static void examplePost() throws NoSuchAlgorithmException,
            KeyManagementException {

        /*
         * There are times during development that security certificates are not
         * available or you can not install the certificates in a particular
         * environment.
         *
         * In this situations you may face the error shown below when attempting
         * to make an SSL connection:
         *
         * javax.net.ssl.SSLHandshakeException:
         * sun.security.validator.ValidatorException: PKIX path building failed:
         * sun.security.provider.certpath.SunCertPathBuilderException: unable to
         * find valid certification path to requested target
         *
         * The HttpClient created below uses a "Trust All"
         * SSLConnectionSocketFactory which blindly trusts all certificates.
         * This is very insecure and leaves you vulnerable to MitM attacks.
         *
         * This approach can be useful during development if security
         * certificates are not available
         */
        final CloseableHttpClient client = HttpClients
                .custom()
                .setSSLSocketFactory(
                        SSLUtil.getInsecureSSLConnectionSocketFactory())
                .build();
        /*
         final HttpPost httpPost = new HttpPost(API_URI);

         final JSONObject jsonToSend = new JSONObject();
         jsonToSend.put("userId", "134256");
         jsonToSend.put("currencyFrom", "EUR");
         jsonToSend.put("currencyTo", "GBP");
         jsonToSend.put("amountSell", 1000);
         jsonToSend.put("amountBuy", 747.10);
         jsonToSend.put("rate", 0.7471);
         jsonToSend.put("timePlaced", "24-JAN-15 10:27:44");
         jsonToSend.put("originatingCountry", "FR");

         // set the content-type to application/json
         httpPost.setEntity(new StringEntity(jsonToSend.toString(), ContentType
         .create("application/json")));
         */

//        HttpGet httpget = new HttpGet("https://http-hunt.thoughtworks-labs.net/challenge");
//        System.out.println("Executing request " + httpget.getRequestLine());
//        httpget.addHeader("userId", "UsByXCIj");
//        
//        try{
//            final CloseableHttpResponse response = client.execute(httpget);
//            final HttpEntity httpEntity = response.getEntity();
//            final String result = EntityUtils.toString(httpEntity);
//            System.out.println("INFO >>> Response from API was: " + result);
//        } catch (IOException ex) {
//            Logger.getLogger(ApacheHttpClientWithSSLConnectionSocketFactory.class.getName()).log(Level.SEVERE, null, ex);
//        }

        // add request headers
        HttpGet httpget = new HttpGet("https://http-hunt.thoughtworks-labs.net/challenge/input");
        System.out.println("Executing request " + httpget.getRequestLine());
        httpget.addHeader("userId", "UsByXCIj");
        try {
            final CloseableHttpResponse response = client.execute(httpget);
            final HttpEntity httpEntity = response.getEntity();
            final String result = EntityUtils.toString(httpEntity);
//            System.out.println("INFO >>> Response from API was: " + result);

            JSONObject jo = new JSONObject(result);
            String para = jo.getString("text");
//            System.out.println("text" + para);

            String lowerCaseString = para.toLowerCase();
            int a = 0, e = 0, i = 0, o = 0, u = 0;
            char[] aa = {'a'};
            char[] ee = {'e'};
            char[] ii = {'i'};
            char[] oo = {'o'};
            char[] uu = {'u'};
            for (int k = 0; k < lowerCaseString.length(); ++k) {
                Character charCharacter = lowerCaseString.charAt(k);

                if (Arrays.binarySearch(aa, charCharacter) >= 0) {
                    a += 1;
                }

                if (Arrays.binarySearch(ee, charCharacter) >= 0) {
                    e += 1;
                }

                if (Arrays.binarySearch(ii, charCharacter) >= 0) {
                    i += 1;
                }

                if (Arrays.binarySearch(oo, charCharacter) >= 0) {
                    o += 1;
                }

                if (Arrays.binarySearch(uu, charCharacter) >= 0) {
                    u += 1;
                }

            }
            final HttpPost httpPost = new HttpPost("https://http-hunt.thoughtworks-labs.net/challenge/output");
            httpPost.addHeader("userId", "UsByXCIj");
            //         final JSONObject jsonToSend = new JSONObject();
            //         jsonToSend.put("userId", "134256");
            //         jsonToSend.put("currencyFrom", "EUR");
            //         jsonToSend.put("currencyTo", "GBP");
            //         jsonToSend.put("amountSell", 1000);
            //         jsonToSend.put("amountBuy", 747.10);
            //         jsonToSend.put("rate", 0.7471);
            //         jsonToSend.put("timePlaced", "24-JAN-15 10:27:44");
            //         jsonToSend.put("originatingCountry", "FR");
            // set the content-type to application/json
            httpPost.setEntity(new StringEntity("{\n"
                    + "\"output\":{\n"
                    + "\"a\":" + a + ",\n"
                    + "\"e\":" + e + ",\n"
                    + "\"i\":" + i + ",\n"
                    + "\"o\":" + o + ",\n"
                    + "\"u\":" + u + "\n"
                    + "}\n"
                    + "}", ContentType.create("application/json")
            ));

//            httpPost.setEntity(new StringEntity("{\"output\":{\"count\":" + para.length() + "}}", ContentType.create("application/json")
//            ));
//            httpPost.setEntity(new StringEntity("{\"output\":{\"wordCount\":" + para.split(" ").length + "}}", ContentType.create("application/json")
//            ));
//            httpPost.setEntity(new StringEntity("{\"output\":{\"sentenceCount\":" + (para.split("[?/.]").length - 1) + "}}", ContentType.create("application/json")
//            ));
            final CloseableHttpResponse response1 = client.execute(httpPost);
            final HttpEntity httpEntity1 = response1.getEntity();
            final String result1 = EntityUtils.toString(httpEntity1);
            System.out.println("Response from API was: " + result1 + "-" + para);
            client.close();
        } catch (IOException | UnsupportedCharsetException | ParseException e) {
        } catch (JSONException ex) {
            Logger.getLogger(ApacheHttpClientWithSSLConnectionSocketFactory.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static class SSLUtil {

        protected static SSLConnectionSocketFactory
                getInsecureSSLConnectionSocketFactory()
                throws KeyManagementException, NoSuchAlgorithmException {
            final TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    public java.security.cert.X509Certificate[]
                            getAcceptedIssuers() {
                        return null;
                    }

                    public void checkClientTrusted(
                            final java.security.cert.X509Certificate[] arg0, final String arg1)
                            throws CertificateException {
                        // do nothing and blindly accept the certificate
                    }

                    public void checkServerTrusted(
                            final java.security.cert.X509Certificate[] arg0, final String arg1)
                            throws CertificateException {
                        // do nothing and blindly accept the server
                    }

                }
            };

            final SSLContext sslcontext = SSLContext.getInstance("SSL");
            sslcontext.init(null, trustAllCerts,
                    new java.security.SecureRandom());

            final SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
                    sslcontext, new String[]{"TLSv1"}, null,
                    SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);

            return sslsf;
        }
    }

    public static void count(String s1) {
        String lowerCaseString = s1.toLowerCase();
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        char[] aa = {'a'};
        char[] ee = {'e'};
        char[] ii = {'i'};
        char[] oo = {'o'};
        char[] uu = {'u'};
        for (int k = 0; k < lowerCaseString.length(); ++k) {
            Character charCharacter = lowerCaseString.charAt(k);

            if (Arrays.binarySearch(aa, charCharacter) >= 0) {
                a += 1;
            }

            if (Arrays.binarySearch(ee, charCharacter) >= 0) {
                e += 1;
            }

            if (Arrays.binarySearch(ii, charCharacter) >= 0) {
                i += 1;
            }

            if (Arrays.binarySearch(oo, charCharacter) >= 0) {
                o += 1;
            }

            if (Arrays.binarySearch(uu, charCharacter) >= 0) {
                u += 1;
            }

        }
        System.out.println(a + "-" + e + "-" + i + "-" + o + "-" + u);
    }

}
