package com.spring.professional.exam.tutorial.module08.question05;

import com.googlecode.junittoolbox.SuiteClasses;
import com.googlecode.junittoolbox.WildcardPatternSuite;
import org.junit.runner.RunWith;

@RunWith(WildcardPatternSuite.class)
@SuiteClasses({"**/*Test[0-9]*.class", "!**/*IntegrationTest[0-9]*.class"})
public class UnitTestsSuite {
}