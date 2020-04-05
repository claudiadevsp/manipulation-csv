import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.Writer;
import csv.File;

class Main {
    public static void main(String[] args) throws IOException, CsvException {

        File data = new File();
        List<String[]> dataTrain = data.readFile("train.csv");
        Integer count = 0;
        Writer writer = Files.newBufferedWriter(Paths.get("/home/challenge-codenation-enem/src/main/resources/testfiles/answer.csv"));
        CSVWriter csvWriter = new CSVWriter(writer);

        List<String[]> lines = new ArrayList<>();
        for( String[] itemTrain : dataTrain ) {
            if (!itemTrain[100].equals("") ) {
                lines.add(new String[]{itemTrain[1], itemTrain[100]});
            }
        }
        csvWriter.writeAll(lines);
        csvWriter.flush();
        writer.close();
    }
}