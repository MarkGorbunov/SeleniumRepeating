package util;

import static org.testng.Assert.fail;

import java.util.List;

public class VerifyHelper
{

    static public Boolean linksContainsText(List<String> linksText, String textForCheck) {
        return linksText.stream().allMatch(text -> text.contains(textForCheck.toLowerCase()));

//        for (String text : linksText)
//        {
//            if (!text.contains(textForCheck.toLowerCase()))
//            {
//                return false;
//            }
//        }
//        return true;
    }
}
