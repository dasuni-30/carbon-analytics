/*
 * Copyright (c)  2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.siddhi.editor.core.exception;

/**
 * This exception will be thrown in case a where it tries to run or debug a faulty Siddhi app.
 */
public class InvalidExecutionStateException extends RuntimeException {

    public InvalidExecutionStateException(String msg) {

        super(msg);
    }

    public InvalidExecutionStateException(Exception cause) {

        super(cause);
    }

    public InvalidExecutionStateException(String msg, Throwable cause) {

        super(msg, cause);
    }

}
