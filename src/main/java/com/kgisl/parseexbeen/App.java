package com.kgisl.parseexbeen;

import java.io.BufferedReader;
import java.io.IOException;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.*;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;

public class App {

    public static void main(String[] args) throws IOException {

        String fileName = "src/main/resources/giveup.csv";
        Path myPath = Paths.get(fileName);

        try (BufferedReader br = Files.newBufferedReader(myPath, StandardCharsets.UTF_8)) {

            HeaderColumnNameMappingStrategy<Giveup> strategy = new HeaderColumnNameMappingStrategy<>();
            strategy.setType(Giveup.class);

            CsvToBean csvToBean = new CsvToBeanBuilder(br).withType(Giveup.class).withMappingStrategy(strategy)
                    .withIgnoreLeadingWhiteSpace(true).build();

         List<Giveup> give = csvToBean.parse();
            // give.forEach(System.out::println);

            Set<Giveup> uniqueRecords = new HashSet<Giveup>(give); //1
            // System.out.println("&&&&&UNIQUE&&&&&&& " + uniqueRecords.size());
            // System.out.println("&&&&&UNIQUE&&&&&&& " + uniqueRecords);
int r=give.size();
Giveup[] empArr = new Giveup[34];
List<String> strings = new ArrayList<>(give.size());
for (Object object : give) {
    strings.add(Objects.toString(object, null));
}

// 
List<Object> list = new ArrayList<Object>(Arrays.asList(new String[]{"Java","is","cool"}));
String[] a = new String[list.size()];
list.toArray(a);
System.out.println("%%%%%%%%%%%%%%%"+Arrays.toString(a));

for (int j=0;j<r;j++)
{
give.hashCode();

}
int count=0;
int count1=1;

boolean v1=give.get(0).equals(give.get(2));
int g=0;

System.out.println("NOT MATCH "+v1);
while(g<5)
{boolean v=give.get(g).equals(give.get(count1));
    System.out.println(" -- G POSITION  "+g+" -- VALUE:  "+give.get(g)+"---  BOoLEAN:  "+v );
    count1++;
    if(v==false)
  { give.remove(count1);


}
else
{  
    System.out.println("NON MATCH "+give.get(count1));
    
}g++;
 }
}   


}








// ArrayList<Giveup> list2 = (Giveup)give;
            // for(i=0;i<r;i++) {
            //     if(give[i].getTRADENUM()==give[i+1].getTRADENUM())
            //     for(Giveup user2 : give) {
            //         if(user1.getEmpCode().equals(user2.getEmpCode())) {
            //             if(!user1.getFirstName().equals(user2.getFirstName()) ||
            //                !user1.getLastName().equals(user2.getLastName()) ||
            //                !user1.getEmail().equals(user2.getEmail())) {
            //                 resultList.add(user1);
            //             }
            //         }
            //     }
            // }




            // Collection<Giveup> nonDuplicatedEmployees = give.stream() //2
            //         .<Map<String, Giveup>>collect(HashMap::new, (m, e) -> m.put(e.getTRADENUM(),  e), Map::putAll)
            //         .values();
            // System.out.println("********nonDuplicatedEmployees******\n"+nonDuplicatedEmployees);
             
            //         give.addAll(nonDuplicatedEmployees);
            //         System.out.println("*111111*********************************************************************");
            // nonDuplicatedEmployees.forEach(System.out::println);

            // System.out.println("**********************************************************************");

            // List<Giveup> listWithoutDuplicates = give.stream().distinct().collect(Collectors.toList()); //3
            // List<Giveup> unique = give.stream()
            //         .collect(Collectors.collectingAndThen(
            //                 Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Giveup::getTRADENUM))),
            //                 ArrayList::new));
            TreeSet<Giveup> positionReports = new TreeSet<Giveup>(Comparator.comparing(Giveup::getTRADENUM));
            Comparator<Giveup> bytradenum = Comparator.comparing(Giveup::getTRADENUM);

            Supplier<TreeSet<Giveup>> supplier = () -> new TreeSet<Giveup>(bytradenum);

            // positionReports = positionReports.stream().collect(Collectors.toCollection(supplier));
            // positionReports.forEach(System.out::println);
            // System.out.println("********POSITION REPORTS*******\n"+positionReports);
            // System.out.println("********POSITION REPORTS*******\n"+positionReports.size());
            // System.out.println("********SUPPLIER*******\n"+supplier);
            // System.out.println("********bytradenum*******\n"+bytradenum);
            // List<Giveup> unique = give.stream()
            //         .collect(Collectors.collectingAndThen(
            //                 Collectors.toCollection(() -> {new TreeSet<>(Comparator.comparing(Giveup::getTRADENUM)},() -> new TreeSet<>(Comparator.comparing(Giveup::getBS_IND))),
            //                 ArrayList::new));

            //         List<String> readingTasks = tasks.stream()
            //                 .filter(task -> task.getType() == TaskType.READING)
            //                 .sorted((t1, t2) -> t1.getTitle().length() - t2.getTitle().length())
            //                 .map(Task::getTitle)
            //                 .collect(Collectors.toList());
            // List<List<Giveup>> list = new ArrayList<>();
            // List<List<Giveup>> flat =give.adapt(list).flatCollect(each -> each);
            //         readingTasks.forEach(System.out::println);
            // Set<Giveup> allItems = give.stream().collect(Collectors.toSet()); //4

            // Set<Giveup> duplicates = give.stream().filter(n -> !allItems.add(n)) //5 //Set.add() returns false if the item was already in the set.
            //         .collect(Collectors.toSet());
            // System.out.println(duplicates); // [1, 4]

            // System.out.println("Duplicate Size = " + duplicates.size());
            // Set<Giveup> myset = give.stream().collect(Collectors.toSet());
            // System.out.println("????????????????");
            // System.out.println(give.stream().collect(Collectors.toSet()));
            // System.out.println("????????++++++++++++++????????");
            // System.out.println(give.stream().collect(Collectors.toSet()).size());
            //HashSet<Giveup> myset = new HashSet<Giveup>(give);

            //   unique.forEach(System.out::println);

            // System.out.println("***LIST SIZE*** " + give.size());
            // // System.out.println("***SET SIZE*** " + unique.size());
            // System.out.println("********DISTINCT****" + listWithoutDuplicates.size());

        
   
}
