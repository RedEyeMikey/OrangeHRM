package Utils;


import com.opencsv.CSVParserBuilder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvUtils {

    public static Object[][] readCSVData(String csvFilePath) throws IOException {
        // List to store the data
        List<Object[]> data = new ArrayList<>();

        // Create a CSVParser to parse the CSV file
        try (FileReader reader = new FileReader(csvFilePath);
             CSVParser csvParser = CSVParserBuilder().withSeparator(";").build(); {

            // Iterate through each record (row) in the CSV file
            for (CSVRecord record : csvParser) {
                List<Object> rowData = new ArrayList<>();

                // Iterate through each column (cell) in the row
                for (String cell : record) {
                    rowData.add(cell);
                }

                // Add row data to the list of data
                data.add(rowData.toArray(new Object[0]));
            }
        }

        // Convert list to a 2D array and return it
        return data.toArray(new Object[0][0]);
    }



    public static Object[][] readExcelData(String filePath, String sheetName) throws IOException {
        File file = new File(filePath);
        FileInputStream fis = new FileInputStream(file);

        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        int rowCount = sheet.getLastRowNum();
        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount][colCount];

        for (int i = 0; i < rowCount;
             i++) {
            Row row = sheet.getRow(i + 1);
            for (int j = 0; j < colCount; j++) {
                Cell cell = row.getCell(j);
                data[i][j] = cell.getStringCellValue();
                // Adjust based on cell type
            }
        }

        workbook.close();
        fis.close();

        return data;
    }
}

