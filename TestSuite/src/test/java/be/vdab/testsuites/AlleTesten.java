package be.vdab.testsuites;

import org.junit.runner.RunWith;

import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import be.vdab.valueobjects.JaarTest;
import be.vdab.valueobjects.RekeningnummerTest;

@RunWith(Suite.class)
@SuiteClasses({
	JaarTest.class, RekeningnummerTest.class
})
public class AlleTesten {

}
