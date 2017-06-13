/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package finalprojectB;

import junit.framework.TestCase;





/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase {

   private boolean printStatus = false;
   private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   
   public void testManualTest()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   System.out.println("Validity: " + urlVal.isValid("http://www.amazon.com"));
       System.out.println("Validity: " + urlVal.isValid("http/0.0.0"));
       System.out.println("Validity: " + urlVal.isValid("ftp://120.125.133.206"));
       System.out.println("Validity: " + urlVal.isValid("ftp://256.25556.256.101"));
       System.out.println("Validity: " + urlVal.isValid("http://www.google.com"));
       System.out.println("Validity: " + urlVal.isValid("http://www.hot mail.com"));
       System.out.println("Validity: " + urlVal.isValid("http://www.reddit.com"));
       System.out.println("Validity: " + urlVal.isValid("http://www.google.com:2000/..//file?action=view"));
   }
   
   
   public void testYourFirstPartition() //check schemes
   {
       UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
       System.out.println("Validity: " + urlVal.isValid("4ht://www.google.com"));
       System.out.println("Validity: " + urlVal.isValid("http://www.google.com"));
       System.out.println("Validity: " + urlVal.isValid("http/www.google.com"));
       System.out.println("Validity: " + urlVal.isValid("ftp://www.google.com"));
       System.out.println("Validity: " + urlVal.isValid("://www.google.com"));
       System.out.println("Validity: " + urlVal.isValid("h3t://www.google.com"));
       System.out.println("Validity: " + urlVal.isValid("f2p://www.google.com"));
       System.out.println("Validity: " + urlVal.isValid("http://www.google.com"));

   }
   
   public void testYourSecondPartition(){ //check country codes
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   System.out.println("Validity: " + urlVal.isValid("http://www.hotmail.com"));
       System.out.println("Validity: " + urlVal.isValid("http://www.hotmail.zz"));
       System.out.println("Validity: " + urlVal.isValid("http://www.hotmail.org"));
       System.out.println("Validity: " + urlVal.isValid("http://www.hotmail.coolcats"));
       System.out.println("Validity: " + urlVal.isValid("http://www.hotmail.tel"));
       System.out.println("Validity: " + urlVal.isValid("http://www.hotmail.invalid"));
       System.out.println("Validity: " + urlVal.isValid("http://www.hotmail.edu"));
       System.out.println("Validity: " + urlVal.isValid("http://www.hotmail.asifmyngi"));

   }
   
   
   public void testIsValid()
   {
	   /*for(int i = 0;i<10000;i++)
	   {
		   
	   }*/
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

	   String prefix[] = {"http://www.google.", "ftp://www.amazon.", "h3t://www.hotmail.", "4ht://www.google.", "://www.yahoo.", "f2p://www.bing."};
	   String suffix[] = {"com", "org", "tel", "zz", "xxk", "asifmyngi"};

	   for(int i = 0; i < prefix.length; i++){
	       for(int j = 0; j < suffix.length; j++){
	           System.out.println(prefix[i] + suffix[j]);
	           assertTrue(urlVal.isValid(prefix[i] + suffix[j]));
           }
       }
   }
   
   public void testAnyOtherUnitTest()
   {
	   
   }
   /**
    * Create set of tests by taking the testUrlXXX arrays and
    * running through all possible permutations of their combinations.
    *
    * @param testObjects Used to create a url.
    */
   

}
