import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
/**
 * Create SatelliteDataConverter to create csv file out of satellite data.
 * @author Phillip Kim
 * @version 1.0
 */
public class SatelliteDataConverter {
    /**
     * Main method that creates a csv file out of satellite data.
     * @param args Location of the satellite data file.
     */
    public static void main(String[] args) {
        File myFile = new File(args[0]);
        Satellite[] mySatellites = createSatelliteArray(myFile);
        File outputFile = new File("satellite_output.csv");
        try {
            PrintWriter pw = new PrintWriter(outputFile);
            for (Satellite mySatellite : mySatellites) {
                String toWrite = mySatellite.encodeCSV();
                if (!toWrite.equals("INCORRECT PASSWORD")) {
                    pw.print(toWrite);
                }
            }
            pw.flush();
            pw.close();
        } catch (FileNotFoundException fnf) {
            System.out.println(fnf.getMessage());
        }
    }

    private static Satellite[] createSatelliteArray(File myFile) {
        int count = myFile.listFiles().length;
        Satellite[] mySatellites = new Satellite[count];
        String[] files = myFile.list();
        for (int i = 0; i < count; i++) {
            try {
                File file = new File(myFile.getPath() + "/" + files[i]);
                Scanner myScan = new Scanner(file);
                String line = new String("");
                while (myScan.hasNext()) {
                    line = line + myScan.nextLine() + "\n";
                }
                Satellite mySatellite = SatelliteTLEParser.parseData(line);
                mySatellites[i] = mySatellite;
            } catch (FileNotFoundException fnf) {
                System.out.println(fnf.getMessage());
            }
        }
        return mySatellites;
    }
}