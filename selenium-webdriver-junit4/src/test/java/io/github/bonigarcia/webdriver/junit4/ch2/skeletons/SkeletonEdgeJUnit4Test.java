/*
 * (C) Copyright 2021 Boni Garcia (https://bonigarcia.org/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package io.github.bonigarcia.webdriver.junit4.ch2.skeletons;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SkeletonEdgeJUnit4Test {

    private WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.edgedriver().setup();
    }

    @Before
    public void setup() {
        driver = new EdgeDriver();
    }

    @After
    public void teardown() {
        driver.quit();
    }

    @Test
    public void test() {
        // TODO: use variable "driver" to call the Selenium WebDriver API
    }

}
