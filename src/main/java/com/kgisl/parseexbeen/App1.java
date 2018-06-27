package com.kgisl.parseexbeen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;

public class App1 {

    public static void main(String[] args) throws IOException {

        String fileName = "src/main/resources/giveup.csv";
        Path myPath = Paths.get(fileName);
        final List<Giveup> giveUpFile=new ArrayList<Giveup>();

        final Set<Giveup> setgiveUpFile = new HashSet<Giveup>();
        
                String[] columns = new String[] { "TRADENUM", "BS_IND", "BROK_ID", "PART_CODE", "INST_TYPE", "SYMBOL",
                        "EXP_DATE", "STR_PRICE", "OPT_TYPE", "TRD_QTY", "TRD_PRICE", "GV_STS", "OC_FLAG", "CU_FLAG",
                        "ORDER_NUM", "LAST_MODIDT", "RESERVED" };
                try {
                    // System.out.println("Reading Bean Started:" +
                    // dateFormat.format(new Date()));
                    setgiveUpFile.addAll(ParseCsvToBean.convert(fileName, ',', Giveup.class, columns));
                    // giveUpFile.forEach(System.out::println);
                    System.out.println(giveUpFile.size());
                    System.out.println(setgiveUpFile.size());
                    // uniqueTradeNo.size());
                    // markPendingCancelRows();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
    }
}
