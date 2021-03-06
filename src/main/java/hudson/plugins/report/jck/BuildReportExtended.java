/*
 * The MIT License
 *
 * Copyright 2016 user.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package hudson.plugins.report.jck;

import hudson.plugins.report.jck.model.BuildReport;
import hudson.plugins.report.jck.model.Suite;
import hudson.plugins.report.jck.model.SuiteTestChanges;
import java.util.List;

public class BuildReportExtended extends BuildReport {

    private final List<String> addedSuites;
    private final List<String> removedSuites;
    private final List<SuiteTestChanges> testChanges;
    private final int total;
    private final int notRun;

    public BuildReportExtended(int buildNumber, String buildName, int passed, int failed, int error, List<Suite> suites,
            List<String> addedSuites, List<String> removedSuites, List<SuiteTestChanges> testChanges, int total, int notRun) {
        super(buildNumber, buildName, passed, failed, error, suites, total, notRun);
        this.addedSuites = addedSuites;
        this.removedSuites = removedSuites;
        this.testChanges = testChanges;
        this.total = total;
        this.notRun = notRun;
    }

    public List<String> getAddedSuites() {
        return addedSuites;
    }

    public List<String> getRemovedSuites() {
        return removedSuites;
    }

    public List<SuiteTestChanges> getTestChanges() {
        return testChanges;
    }

    @Override
    public int getTotal(){
        return total;
    }

    @Override
    public int getNotRun(){
        return notRun;
    }

}
