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

package org.datavec.api.transform.filter;

import org.datavec.api.writable.Writable;
import org.datavec.api.transform.schema.Schema;

import java.io.Serializable;
import java.util.List;

/**
 * Filter: a method of removing examples (or sequences) according to some condition
 *
 * @author Alex Black
 */
public interface Filter extends Serializable {

    /**
     * @param writables Example
     * @return true if example should be removed, false to keep
     */
    boolean removeExample(List<Writable> writables);

    /**
     * @param sequence sequence example
     * @return true if example should be removed, false to keep
     */
    boolean removeSequence(List<List<Writable>> sequence);

    void setInputSchema(Schema schema);

    Schema getInputSchema();

}
