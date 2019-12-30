/*
 * Copyright (C) 2018 The Sylph Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ideal.sylph.etl.api;

import ideal.sylph.etl.PipelinePlugin;
import ideal.sylph.etl.Row;

public interface RealTimeSink
        extends PipelinePlugin, RealTimePipeline
{
    /**
     * ByCommitState
     */
    default void flush()
            throws Exception
    {}

    /**
     * line 级别的 需要注意线程安全问题
     **/
    void process(Row value);
}