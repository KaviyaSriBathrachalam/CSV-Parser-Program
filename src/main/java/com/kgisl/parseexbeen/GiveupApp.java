package com.kgisl.parseexbeen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;

public class GiveupApp {



    public static void main(String[] args) throws IOException {


        // String fileName = "src/main/resources/giveup.csv";
       
        CsvToBean<Giveup> csv = new CsvToBean<Giveup>();
		String csvFilename = "src/main/resources/giveup.csv";
		CSVReader csvReader = null;

		try {
			csvReader = new CSVReader(new FileReader(csvFilename));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Set column mapping strategy
		@SuppressWarnings({ "unchecked" })
        List<Giveup> list = csv.parse(setColumMapping(), csvReader);
		// list.forEach(System.out::println);
        System.out.println(list.size());
       
        Set<Giveup> myset = new HashSet<Giveup>(list);
        System.out.println(myset.size());
        myset.forEach(System.out::println);
                    
        System.out.println("***LIST SIZE*** "+list.size());
        System.out.println("***SET SIZE*** "+myset.size());

        // System.out.println("List values .....> "+ list.size());
    	// List<String> list1 = new ArrayList<String>();
        // list1.add("1");
        // list1.add("2");
        // list1.add("3");
        // list1.add("4");
        // list1.add("1");
        
        // list1.forEach(System.out::println);
        
        // Set<String> set = new HashSet<String>(list1);
        
        // System.out.println("Set values .....> "+set.size());
        // set.forEach(System.out::println);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
	private static ColumnPositionMappingStrategy setColumMapping() {
		ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
		strategy.setType(Giveup.class);
		String[] columns = new String[] { "TRADENUM", "BS_IND", "BROK_ID", "PART_CODE", "INST_TYPE", "SYMBOL",
				"EXP_DATE", "STR_PRICE", "OPT_TYPE", "TRD_QTY", "TRD_PRICE", "GV_STS", "OC_FLAG", "CU_FLAG",
				"ORDER_NUM", "LAST_MODIDT", "RESERVED" };
		strategy.setColumnMapping(columns);
		return strategy;
	}
}
