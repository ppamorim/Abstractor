![Logo 1][10]

[![Build Status](https://api.travis-ci.org/ppamorim/Cult.svg?branch=master)](https://travis-ci.org/ppamorim/Cult)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Cult-blue.svg?style=flat)](https://android-arsenal.com/details/1/1913)
[![JitPack](https://img.shields.io/github/release/ppamorim/Cult.svg?label=JitPack%20Maven)](https://jitpack.io/#ppamorim/Cult)

Abstractor is a tiny library that will help you to develop an Android application, this have a collection of abstract and helper classes to reduce the boilerplate code.

This library should work on API 10.

Usage
-----

* You can replace this:

```java
  public class BoringActivity extends AppCompatActivity {

    private View boringView;

    @Override public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_boring);
      boringView = findViewById(R.id.view_boring);
      boringView.setOnClickListener(onClickListener);
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
      @Override public void onClick(View v) {
        //doSomething
      }
    };

  }
```

* With this:

```java
  public class BaseActivity extends AbstractActivity {
    @Override protected int getLayoutId() {
      return R.layout.activity_base;
    }
    @OnClick(R.id.view_happy) void onViewClick() {
      //doSomething
    }
  }
```

That's all. Your activity is ready!

This library uses ButterKnife to instantiate the views, you can this amazing library at your project too.

Classes
-------

You can extends your class with:

An clear Activity: `AbstractActivity`.

Activity with Toolbar: `AbstractToolbarActivity`.

Activity with DrawerLayout: `AbstractDrawerActivity`.

Import dependency
--------------------------------

* This library is under development yet.

This library use `appcompat-v7:22.1.1` and `butterKnife:7.0.0`.

But why not to add in MavenCentral?
Because it is so much bureaucratic.

JitPack is there and is the future!

Into your build.gradle:

```groovy

repositories {
  maven {
    url "https://jitpack.io"
  }
}

dependencies {
  compile 'com.github.ppamorim:abstractor:0.1'
}
```

Contributors
------------

* [Pedro Paulo de Amorim][3]

Developed By
------------

* Pedro Paulo de Amorim - <pp.amorim@hotmail.com>

<a href="https://www.linkedin.com/profile/view?id=185411359">
  <img alt="Add me to Linkedin" src="http://imageshack.us/a/img41/7877/smallld.png" />
</a>

Libraries used on the sample project
------------------------------------

* [SmartTabLayout][6]

License
-------

    Copyright 2015 Pedro Paulo de Amorim

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

[3]: https://github.com/ppamorim/
[5]: https://github.com/JakeWharton/butterknife
[6]: https://github.com/ogaclejapan/SmartTabLayout
[10]: ./art/logo.png
