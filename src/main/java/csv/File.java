package csv;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class File {

    public List<String[]> readFile(String file) throws IOException, CsvException {

        Reader reader = Files.newBufferedReader(Paths.get("/home/challenge-codenation-enem/src/main/resources/testfiles/" + file));
        CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
        List<String[]> dataFile = csvReader.readAll();
        return dataFile;
    }



}
