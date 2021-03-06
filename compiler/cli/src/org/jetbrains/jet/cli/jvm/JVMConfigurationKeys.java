/*
 * Copyright 2010-2012 JetBrains s.r.o.
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

package org.jetbrains.jet.cli.jvm;

import com.intellij.openapi.util.Key;

import java.io.File;

/**
 * @author Evgeny Gerashchenko
 * @since 7/3/12
 */
public class JVMConfigurationKeys {
    private JVMConfigurationKeys() {
    }

    public static final Key<File[]> CLASSPATH_KEY = Key.create("classpath");
    public static final Key<File[]> ANNOTATIONS_PATH_KEY = Key.create("annotations path");
}
