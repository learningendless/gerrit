// Copyright (C) 2017 The Android Open Source Project
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.gerrit.extensions.api.projects;

import com.google.common.base.Joiner;
import com.google.gerrit.extensions.restapi.Url;
import java.util.ArrayList;
import java.util.List;

public class DashboardInfo {
  public String id;
  public String project;
  public String definingProject;
  public String ref;
  public String path;
  public String description;
  public String foreach;
  public String url;

  public Boolean isDefault;

  public String title;
  public List<DashboardSectionInfo> sections = new ArrayList<>();

  public DashboardInfo(String ref, String name) {
    this.ref = ref;
    this.path = name;
    this.id = Joiner.on(':').join(Url.encode(ref), Url.encode(path));
  }
}