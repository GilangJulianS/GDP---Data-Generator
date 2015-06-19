import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class HardCodedGenerator {

	List<Location> rumah;
	List<List<Location>> jalan;
	List<Location> jalanKeTA;
	List<Location> citicon;
	List<Location> taman;
	float[] times = {6.7f, 6.8f, 6.9f, 7f, 7.1f, 7.2f};
	float[] times2 = {18.2f, 18.1f, 18f, 17.9f, 17.8f, 17.7f};
	Random random;
	
	public HardCodedGenerator(){
		rumah = new ArrayList<Location>();
		jalan = new ArrayList<List<Location>>();
		citicon = new ArrayList<Location>();
		jalanKeTA = new ArrayList<Location>();
		taman = new ArrayList<>();
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

		jalanKeTA.add(new Location("-6.243306, 106.859090"));
		jalanKeTA.add(new Location("-6.241637, 106.837450"));
		jalanKeTA.add(new Location("-6.230062, 106.819498"));
		jalanKeTA.add(new Location("-6.215215, 106.809499"));
		jalanKeTA.add(new Location("-6.200395, 106.798953"));
		jalanKeTA.add(new Location("-6.192691, 106.797402"));
		jalanKeTA.add(new Location("-6.180749, 106.796605"));
		jalanKeTA.add(new Location("-6.176760, 106.793655"));

		taman.add(new Location("-6.177507, 106.792968"));
		taman.add(new Location("-6.178627, 106.792689"));
		taman.add(new Location("-6.178115, 106.791208"));
		taman.add(new Location("-6.177987, 106.792313"));
		taman.add(new Location("-6.176909, 106.790500"));
		taman.add(new Location("-6.176312, 106.791981"));
		taman.add(new Location("-6.177891, 106.789728"));
		taman.add(new Location("-6.178040, 106.792153"));


	}
	
	public void generate(double jitterLoc, int days, float interval){
		for(int i=0; i<days; i++){
			for(float j=0; j<24; j+=interval){
				if(j < 6.5f){
					int temp = random.nextInt(rumah.size());
					Location tempLoc = rumah.get(temp);
					double lat = jitter(tempLoc.getLattitude(), jitterLoc);
					double lon = jitter(tempLoc.getLongitude(), jitterLoc);
					System.out.println(i%7 + ", " + j + ", " + lat + ", " + lon);
				}else if(j < 8f){
					int temp = random.nextInt(10);
					List<Location> locations = jalan.get(temp);
					for(int k=0; k<6; k++){
						float jitterTime = (float)random.nextInt(100)/1000;
						Location tempLoc = locations.get(k);
						double lat = jitter(tempLoc.getLattitude(), jitterLoc);
						double lon = jitter(tempLoc.getLongitude(), jitterLoc);
						System.out.println(i%7 + ", " + (times[k] + jitterTime) + ", " + lat + ", " + lon);
					}
					j = 8f;
				}else if(j < 17f){
					int temp = random.nextInt(citicon.size());
					Location tempLoc = citicon.get(temp);
					double lat = jitter(tempLoc.getLattitude(), jitterLoc);
					double lon = jitter(tempLoc.getLongitude(), jitterLoc);
					System.out.println(i%7 + ", " + j + ", " + lat + ", " + lon);
				}else if(j < 19f){
					int temp = random.nextInt(10);
					List<Location> locations = jalan.get(temp);
					for(int k=5; k>=0; k--){
						float jitterTime = (float)random.nextInt(100)/1000;
						Location tempLoc = locations.get(k);
						double lat = jitter(tempLoc.getLattitude(), jitterLoc);
						double lon = jitter(tempLoc.getLongitude(), jitterLoc);
						System.out.println(i%7 + ", " + (times2[k] + jitterTime) + ", " + lat + ", " + lon);
					}
					j = 19f;
				}else{
					int temp = random.nextInt(rumah.size());
					Location tempLoc = rumah.get(temp);
					double lat = jitter(tempLoc.getLattitude(), jitterLoc);
					double lon = jitter(tempLoc.getLongitude(), jitterLoc);
					System.out.println(i%7 + ", " + j + ", " + lat + ", " + lon);
				}
			}


			for(float j=0; j<24; j+=interval){
				if(j < 6.5f){
					int temp = random.nextInt(rumah.size());
					Location tempLoc = rumah.get(temp);
					double lat = jitter(tempLoc.getLattitude(), jitterLoc);
					double lon = jitter(tempLoc.getLongitude(), jitterLoc);
					System.out.println(i%7 + ", " + j + ", " + lat + ", " + lon);
				}else if(j < 8f){
					int temp = random.nextInt(10);
					for(int k=0; k<6; k++){
						float jitterTime = (float)random.nextInt(100)/1000;
						Location tempLoc = jalanKeTA.get(k);
						double lat = jitter(tempLoc.getLattitude(), jitterLoc);
						double lon = jitter(tempLoc.getLongitude(), jitterLoc);
						System.out.println(i%7 + ", " + (times[k] + jitterTime) + ", " + lat + ", " + lon);
					}
					j = 8f;
				}else if(j < 17f){
					int temp = random.nextInt(taman.size());
					Location tempLoc = taman.get(temp);
					double lat = jitter(tempLoc.getLattitude(), jitterLoc);
					double lon = jitter(tempLoc.getLongitude(), jitterLoc);
					System.out.println(i%7 + ", " + j + ", " + lat + ", " + lon);
				}else if(j < 19f){
					int temp = random.nextInt(10);
					for(int k=5; k>=0; k--){
						float jitterTime = (float)random.nextInt(100)/1000;
						Location tempLoc = jalanKeTA.get(k);
						double lat = jitter(tempLoc.getLattitude(), jitterLoc);
						double lon = jitter(tempLoc.getLongitude(), jitterLoc);
						System.out.println(i%7 + ", " + (times2[k] + jitterTime) + ", " + lat + ", " + lon);
					}
					j = 19f;
				}else{
					int temp = random.nextInt(rumah.size());
					Location tempLoc = rumah.get(temp);
					double lat = jitter(tempLoc.getLattitude(), jitterLoc);
					double lon = jitter(tempLoc.getLongitude(), jitterLoc);
					System.out.println(i%7 + ", " + j + ", " + lat + ", " + lon);
				}
			}
		}
	}
	
	private double jitter(double origin, double jitterVal){
		boolean tempBol = random.nextBoolean();
		if(tempBol)
			return origin + jitterVal;
		else
			return origin - jitterVal;
	}
	
	public static void main(String[] args){
		HardCodedGenerator gen = new HardCodedGenerator();
		gen.generate(0.0001f, 30, 0.167f);
	}
}
