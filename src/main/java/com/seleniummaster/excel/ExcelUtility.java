package com.seleniummaster.excel;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtility {
    //write a method to read from excel cells
    public String readExcelCell(String fileName, String sheetName, int rowNumber, int cellNumber) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        XSSFSheet sheet = workbook.getSheet(sheetName);
        XSSFRow row = sheet.getRow(rowNumber);
        String cellValue = null;
        if (row == null) {
            System.out.println("Empty Row,no data in the excel sheet");
        } else {
            XSSFCell cell = row.getCell(cellNumber);
            CellType cellType = cell.getCellType();
            switch (cellType) {
                case NUMERIC:
                    cellValue = String.valueOf(cell.getNumericCellValue());
                    System.out.println(cellValue);
                    break;

                case STRING:
                    cellValue = cell.getStringCellValue();
                    System.out.println(cellValue);
                    break;

            }

        }
        return cellValue;
    }

    public List<LoginInfo> readMultipleCellValue(String fileName, String sheetName, int startRow) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        XSSFSheet sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getLastRowNum();
        System.out.println("Last row Number is :" + rowCount);

        List<LoginInfo> loginUser = new ArrayList<>();
        for (int r = startRow; r <= rowCount; r++) {
            XSSFRow row = sheet.getRow(r);
            if (row == null) {
                System.out.println("Empty Row");

            } else {
                XSSFCell userNameCell = row.getCell(0);
                XSSFCell passwordCell = row.getCell(1);
                loginUser.add(new LoginInfo(userNameCell.getStringCellValue(),
                        passwordCell.getStringCellValue()));
            }

        }
        System.out.println(loginUser.toString());
        return loginUser;
    }

    public void writeToExcelMultipleCells(String fileName, String sheetName, List<String> contents) {
        //define a file to write
        File excelFile = new File(fileName);
        //define a work book
        XSSFWorkbook workbook = new XSSFWorkbook();
        //add sheet to the work book
        XSSFSheet sheet = workbook.createSheet(sheetName);
        //define row(s) in the work
        int numberOfRows = contents.size();
        for (int rowNUmber = 0; rowNUmber < numberOfRows; rowNUmber++) {
            XSSFRow row = sheet.createRow(rowNUmber);
            String[] rowContent = contents.get(rowNUmber).split(",");
            int totalCell = rowContent.length;
            for (int cellNumber = 0; cellNumber < totalCell; cellNumber++) {
                XSSFCell cell = row.createCell(cellNumber);
                //add contents to the cell
                cell.setCellValue(rowContent[cellNumber]);
                if (rowContent[cellNumber].equalsIgnoreCase("Passed")){
                    CellStyle style = workbook.createCellStyle();
                    style.setFillForegroundColor(IndexedColors.DARK_GREEN.getIndex());
                    style.setFillPattern(FillPatternType.BIG_SPOTS);
                    cell.setCellStyle(style);
                }

            }
        }
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(excelFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            workbook.close();
        } catch (IOException e) {

        }

    }

}
