/*
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.jax.rs;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.kie.api.command.Command;
import org.kie.api.runtime.CommandExecutor;

public class CommandExecutorImpl
    implements
    CommandExecutor {

    public CommandExecutorImpl() {

    }

    public CommandExecutorImpl(boolean restFlag) {

    }

    @POST()
    @Path("/execute")
    @Consumes("text/plain")
    @Produces("text/plain")
    public <T> T execute(Command<T> command) {
        throw new UnsupportedOperationException( "This should never be called, as it's handled by camel" );
    }
}
