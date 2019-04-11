/*
 * Copyright © 2019 - present. MEDIA NET SOFTWARE SERVICES PVT. LTD.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.media;

import java.util.ArrayList;
import java.util.List;

/** Created by sourav.p on . */
public class TestOutput {
  private Long totalTestCases;
  private Integer failedTestCases;
  private List<OutputTestPojo> failedTestList = new ArrayList<>();

  public List<OutputTestPojo> getFailedTestList() {
    return failedTestList;
  }

  public void setTotalTestCases(Long totalTestCases) {
    this.totalTestCases = totalTestCases;
  }

  public void setFailedTestCases(Integer failedTestCases) {
    this.failedTestCases = failedTestCases;
  }
}
