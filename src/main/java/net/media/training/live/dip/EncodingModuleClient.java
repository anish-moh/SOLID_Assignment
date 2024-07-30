package net.media.training.live.dip;

import java.io.IOException;
/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:20:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        // EncodingModule encodingModule  = new EncodingModule();
        // encodingModule.encodeWithFiles();
        // encodingModule.encodeBasedOnNetworkAndDatabase();
        ReadFromFile readfromfile = new ReadFromFile();
        ReadFromUrl readFromUrl = new ReadFromUrl();

        String file_content = readfromfile.read();
        String url_content = readFromUrl.read();

        Base64Encoder base64Encoder = new Base64Encoder();

        String encoded_file = base64Encoder.encode(file_content);
        String encoded_url = base64Encoder.encode(url_content);
    }
}
