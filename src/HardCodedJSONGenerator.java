import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by gilang on 28/07/15.
 */
public class HardCodedJSONGenerator {


    List<Location> rumah;
    List<List<Location>> jalan;
    List<Location> citicon;
    List<Location> TA;
    float[] times = {6.6f, 6.8f, 7f, 7.25f, 7.5f, 7.75f};
    float[] times2 = {18.75f, 18.5f, 18.25f,18f, 17.8f, 17.6f};
    Random random;

    public HardCodedJSONGenerator(){
        rumah = new ArrayList<Location>();
        jalan = new ArrayList<List<Location>>();
        citicon = new ArrayList<Location>();
        TA = new ArrayList<>();
        random = new Random();
        fillData();
    }

    private void fillData(){
        rumah.add(new Location("-6.252328, 106.864656"));
        rumah.add(new Location("-6.252307, 106.864634"));
        rumah.add(new Location("-6.252253, 106.864592"));
        rumah.add(new Location("-6.252181, 106.864564"));
        rumah.add(new Location("-6.252303, 106.864543"));
        rumah.add(new Location("-6.252360, 106.864663"));
        rumah.add(new Location("-6.252316, 106.864621"));

        List<Location> tempJalan = new ArrayList<Location>();
        tempJalan.add(new Location("-6.251465, 106.865050"));
        tempJalan.add(new Location("-6.243264, 106.856832"));
        tempJalan.add(new Location("-6.241136, 106.835401"));
        tempJalan.add(new Location("-6.228521, 106.818420"));
        tempJalan.add(new Location("-6.213765, 106.808448"));
        tempJalan.add(new Location("-6.198321, 106.798094"));
        jalan.add(tempJalan);

        tempJalan = new ArrayList<Location>();
        tempJalan.add(new Location("-6.250932, 106.865286"));
        tempJalan.add(new Location("-6.243264, 106.854600"));
        tempJalan.add(new Location("-6.240630, 106.833422"));
        tempJalan.add(new Location("-6.226702, 106.817256"));
        tempJalan.add(new Location("-6.212528, 106.807208"));
        tempJalan.add(new Location("-6.196811, 106.797638"));
        jalan.add(tempJalan);

        tempJalan = new ArrayList<Location>();
        tempJalan.add(new Location("-6.249850, 106.865764"));
        tempJalan.add(new Location("-6.243264, 106.852814"));
        tempJalan.add(new Location("-6.239379, 106.831265"));
        tempJalan.add(new Location("-6.224852, 106.816065"));
        tempJalan.add(new Location("-6.210768, 106.805910"));
        tempJalan.add(new Location("-6.195523, 106.797343"));
        jalan.add(tempJalan);

        tempJalan = new ArrayList<Location>();
        tempJalan.add(new Location("-6.248031, 106.866627"));
        tempJalan.add(new Location("-6.243317, 106.850518"));
        tempJalan.add(new Location("-6.238285, 106.829441"));
        tempJalan.add(new Location("-6.223748, 106.815266"));
        tempJalan.add(new Location("-6.209371, 106.804800"));
        tempJalan.add(new Location("-6.195112, 106.798942"));
        jalan.add(tempJalan);

        tempJalan = new ArrayList<Location>();
        tempJalan.add(new Location("-6.245658, 106.867781"));
        tempJalan.add(new Location("-6.243440, 106.848914"));
        tempJalan.add(new Location("-6.236904, 106.827228"));
        tempJalan.add(new Location("-6.222351, 106.814316"));
        tempJalan.add(new Location("-6.207840, 106.803480"));
        tempJalan.add(new Location("-6.193971, 106.798990"));
        jalan.add(tempJalan);

        tempJalan = new ArrayList<Location>();
        tempJalan.add(new Location("-6.244437, 106.867405"));
        tempJalan.add(new Location("-6.243562, 106.846720"));
        tempJalan.add(new Location("-6.235789, 106.825544"));
        tempJalan.add(new Location("-6.221092, 106.813426"));
        tempJalan.add(new Location("-6.206459, 106.802305"));
        tempJalan.add(new Location("-6.192526, 106.798689"));
        jalan.add(tempJalan);

        tempJalan = new ArrayList<Location>();
        tempJalan.add(new Location("-6.243962, 106.866225"));
        tempJalan.add(new Location("-6.243408, 106.843603"));
        tempJalan.add(new Location("-6.234296, 106.823350"));
        tempJalan.add(new Location("-6.219754, 106.812487"));
        tempJalan.add(new Location("-6.205542, 106.801597"));
        tempJalan.add(new Location("-6.191198, 106.798684"));
        jalan.add(tempJalan);

        tempJalan = new ArrayList<Location>();
        tempJalan.add(new Location("-6.243360, 106.864310"));
        tempJalan.add(new Location("-6.242864, 106.841946"));
        tempJalan.add(new Location("-6.233134, 106.821805"));
        tempJalan.add(new Location("-6.218725, 106.811779"));
        tempJalan.add(new Location("-6.204022, 106.800739"));
        tempJalan.add(new Location("-6.191203, 106.797397"));
        jalan.add(tempJalan);

        tempJalan = new ArrayList<Location>();
        tempJalan.add(new Location("-6.243280, 106.861156"));
        tempJalan.add(new Location("-6.242192, 106.839596"));
        tempJalan.add(new Location("-6.231806, 106.820775"));
        tempJalan.add(new Location("-6.216575, 106.810432"));
        tempJalan.add(new Location("-6.202256, 106.799891"));
        tempJalan.add(new Location("-6.192691, 106.797402"));
        jalan.add(tempJalan);

        tempJalan = new ArrayList<Location>();
        tempJalan.add(new Location("-6.243306, 106.859090"));
        tempJalan.add(new Location("-6.241637, 106.837450"));
        tempJalan.add(new Location("-6.230062, 106.819498"));
        tempJalan.add(new Location("-6.215215, 106.809499"));
        tempJalan.add(new Location("-6.200395, 106.798953"));
        tempJalan.add(new Location("-6.192691, 106.797402"));
        jalan.add(tempJalan);

        citicon.add(new Location("-6.192713, 106.797858"));
        citicon.add(new Location("-6.192698, 106.797652"));
        citicon.add(new Location("-6.192582, 106.797690"));
        citicon.add(new Location("-6.192597, 106.797883"));
        citicon.add(new Location("-6.192765, 106.797918"));
        citicon.add(new Location("-6.192657, 106.797828"));

        TA.add(new Location("-6.178412, 106.789568"));
        TA.add(new Location("-6.177522, 106.789978"));
        TA.add(new Location("-6.177477, 106.790661"));
        TA.add(new Location("-6.177582, 106.791510"));
        TA.add(new Location("-6.176511, 106.791450"));
        TA.add(new Location("-6.176451, 106.790676"));
    }

    public void generate(double jitterLoc, int days, float interval){
        for(int i=0; i<days; i++){
            for(float j=0; j<24; j+=interval){
                if(j < 6.5f){
                    int temp = random.nextInt(rumah.size());
                    Location tempLoc = rumah.get(temp);
                    double lat = jitter(tempLoc.getLattitude(), jitterLoc);
                    double lon = jitter(tempLoc.getLongitude(), jitterLoc);
                    printItem((int)j + ":" + (int)((j - (int)j)*60f) + ":00", lat, lon);
                    if(i<days || j+interval < 24) {
                        System.out.println(",");
                    }
                }else if(j < 8f){
                    int temp = random.nextInt(10);
                    List<Location> locations = jalan.get(temp);
                    for(int k=0; k<6; k++){
                        float jitterTime = (float)random.nextInt(100)/1000;
                        Location tempLoc = locations.get(k);
                        double lat = jitter(tempLoc.getLattitude(), jitterLoc);
                        double lon = jitter(tempLoc.getLongitude(), jitterLoc);
                        double time = (times[k] + jitterTime);
                        printItem((int) time + ":" + (int)((time - (int)time)*60f) + ":00", lat, lon);
                        System.out.println(",");
                    }
                    j = 8f;
                }else if(j < 17f){
                    if(i % 7 == 5 || i % 7 == 6) {
                        int temp = random.nextInt(TA.size());
                        Location tempLoc = TA.get(temp);
                        double lat = jitter(tempLoc.getLattitude(), jitterLoc);
                        double lon = jitter(tempLoc.getLongitude(), jitterLoc);
                        printItem((int) j + ":" + (int) ((j - (int) j) * 60f) + ":00", lat, lon);
                    }else {
                        int temp = random.nextInt(citicon.size());
                        Location tempLoc = citicon.get(temp);
                        double lat = jitter(tempLoc.getLattitude(), jitterLoc);
                        double lon = jitter(tempLoc.getLongitude(), jitterLoc);
                        printItem((int) j + ":" + (int) ((j - (int) j) * 60f) + ":00", lat, lon);
                    }
                    if(i<days || j+interval < 24) {
                        System.out.println(",");
                    }
                }else if(j < 19f){
                    int temp = random.nextInt(10);
                    List<Location> locations = jalan.get(temp);
                    for(int k=5; k>=0; k--){
                        float jitterTime = (float)random.nextInt(100)/1000;
                        Location tempLoc = locations.get(k);
                        double lat = jitter(tempLoc.getLattitude(), jitterLoc);
                        double lon = jitter(tempLoc.getLongitude(), jitterLoc);
                        double time = (times2[k] + jitterTime);
                        printItem((int)time + ":" + (int)((time - (int)time)*60f) + ":00", lat, lon);
                        System.out.println(",");
                    }
                    j = 19f;
                }else{
                    int temp = random.nextInt(rumah.size());
                    Location tempLoc = rumah.get(temp);
                    double lat = jitter(tempLoc.getLattitude(), jitterLoc);
                    double lon = jitter(tempLoc.getLongitude(), jitterLoc);
                    printItem((int)j + ":" + (int)((j - (int)j)*60f) + ":00", lat, lon);
                    if(i<days || j+interval < 24) {
                        System.out.println(",");
                    }
                }
            }
        }
    }

    private void printItem(String time, double lattitude, double longitude){
//        System.out.println(time + " " + lattitude + " " + longitude);
        System.out.println("{\n" +
                "    \"ACL\": {\n" +
                "        \"role:353588100015694\": {\n" +
                "            \"read\": true,\n" +
                "            \"write\": true\n" +
                "        }\n" +
                "    },\n" +
                "    \"createdAt\": \"2015-05-11T" + time + "Z\",\n" +
                "    \"deviceId\": \"353588100015694\",\n" +
                "    \"location\": {\n" +
                "        \"__type\": \"GeoPoint\",\n" +
                "        \"latitude\": " + lattitude + ",\n" +
                "        \"longitude\": " + longitude + "\n" +
                "    },\n" +
                "    \"objectId\": \"WrMPIJfNCI\",\n" +
                "    \"updatedAt\": \"2015-05-11T" + time + "Z\"\n" +
                "}");
    }

    private double jitter(double origin, double jitterVal){
        boolean tempBol = random.nextBoolean();
        int tempInt = random.nextInt(200);
        if(tempBol)
            return origin + (jitterVal * tempInt / 100);
        else
            return origin - (jitterVal * tempInt / 100);
    }

    public static void main(String[] args){
        HardCodedJSONGenerator gen = new HardCodedJSONGenerator();
        System.out.println("{ \"results\": [");
        gen.generate(0.0001d, 30, 0.137f);
        System.out.println("]}");
    }
}
