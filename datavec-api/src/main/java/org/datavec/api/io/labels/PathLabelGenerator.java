/*
 *  * Copyright 2016 Skymind, Inc.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 */

package org.datavec.api.io.labels;

import org.datavec.api.writable.Writable;

import java.io.Serializable;
import java.net.URI;

/**
 * PathLabelGenerator: interface to infer the label of a file directly from the path of a file<br>
 * Example: /negative/file17.csv -> class "0"; /positive/file116.csv -> class "1" etc.<br>
 * Though note that the output is a writable, hence it need not be numerical.
 * @author Alex Black
 */
public interface PathLabelGenerator extends Serializable {

    Writable getLabelForPath(String path);

    Writable getLabelForPath(URI uri);

}
