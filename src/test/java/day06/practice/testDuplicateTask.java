package day06.practice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
public class testDuplicateTask {
	private List<String> cityList;

    @BeforeEach
    public void setUp() {
        cityList = new ArrayList<>();
        cityList.add("Tamilnadu");
        cityList.add("kerala");
        cityList.add("karnataka");
        cityList.add("delhi");
        cityList.add("Tamilnadu");
    }
	@Test
    public void testRemoveDuplicates() {
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Tamilnadu");
        expectedList.add("kerala");
        expectedList.add("karnataka");
        expectedList.add("delhi");

        List<String> RCityList = new ArrayList<>();

        for (String city : RCityList) {
            if (!RCityList.contains(city)) {
                RCityList.add(city);
            }
        }

        Assertions.assertEquals(expectedList, RCityList);
    }
}


