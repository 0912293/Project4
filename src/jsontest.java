//https://maps.googleapis.com/maps/api/geocode/output?parameters

import org.json.simple.JSONObject;
public class jsontest{
        public static void main(String[] args) {
            JSONObject obj = new JSONObject();

            obj.put("https://www.googleapis.com/geolocation/v1/geolocate?key=AIzaSyAR4Nxm9dA8VGEFcfj71EFplMezKCRJSLI","test");


            System.out.print(obj);
        }
}

