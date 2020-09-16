import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JSON_Multiplicator {

    public void generateJSONProductsServices() {
        File JSONFile = new File("C:\\Users\\gabriel.andrade\\Downloads\\JSONProductsServices4.txt");;
        FileWriter fw = null;
        try {
            JSONFile.createNewFile();
            fw = new FileWriter(JSONFile);
        }
        catch (IOException e) {
            System.err.println("An error occurred.");
            e.printStackTrace();
        }
        int i;
        try {

            fw.write("{\n");
            fw.write("\"productsServices\": [\n");

            for (i=0; JSONFile.length() < 1500000; i++) {   //usar .length depois
                fw.write("{\n");
                fw.write("\"productsServicesVersion\": \"1.12\",\n");
                fw.write("\"validityBegin\": \"2019-10-15T00:00:00\",\n");
                fw.write("\"validityEnd\": \"2019-10-15T00:00:00\",\n");
                fw.write("\"productsCount\": 10,\n");
                fw.write("\"servicesCount\": 10\n");
                fw.write("},\n");
            }

            fw.write("]\n");
            fw.write("}\n");

            fw.close();
            //System.out.println("i: " + i);
        }
        catch (IOException e) {
            System.err.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void generateJSONServicesPoints() {
        File JSONFile = new File("C:\\Users\\gabriel.andrade\\Downloads\\JSONServicesPoints1.txt");;
        FileWriter fw = null;
        try {
            JSONFile.createNewFile();
            fw = new FileWriter(JSONFile);
        }
        catch (IOException e) {
            System.err.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            fw.write("{\n");
            fw.write("\"UF\": \"uf\",\n");
            fw.write("\"City\": \"city\",\n");
            fw.write("\"servicePoints\": [\n");

            for (int i=0; JSONFile.length() < 1500000; i++) {   //usar .length depois
                fw.write("{\n");
                fw.write("\"Neighborhood\": \"neighborhood\",\n");
                fw.write("\"CEP\": \"00.000-000\",\n");
                fw.write("\"Address\": \"address\",\n");
                fw.write("\"Number\": \"123456\",\n");
                fw.write("\"supplementaryData\": \"supplementary data\",\n");
                fw.write("\"CNPJ\": \"00.000.000/0000-00\",\n");
                fw.write("\"servicePointId\": 2541,\n");
                fw.write("\"servicePointType\": \"Agency\",\n");
                fw.write("\"agencyCode\": \"000000\",\n");
                fw.write("\"Coordinates\": {\n");
                fw.write("\"ddLatitude\": 40.741895,\n");
                fw.write("\"ddLongitude\": -73.989308,\n");
                fw.write("\"LatLong\": \"40.741895,-73.989308\",\n");
                fw.write("\"dmsLatitudeN\": \"40.44.30822\",\n");
                fw.write("\"dmsLatitudeS\": \"\",\n");
                fw.write("\"dmsLongitudeE\": \"\",\n");
                fw.write("\"dmsLongitudeW\": \"73.59.21508\"\n");
                fw.write("}\n");
                fw.write("},\n");
            }

            fw.write("]\n");
            fw.write("}\n");

            fw.close();
        }
        catch (IOException e) {
            System.err.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
