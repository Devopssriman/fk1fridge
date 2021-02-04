/*
 * Copyright 2016-2017 Testify Project.
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
package fk1.common;

import java.util.UUID;
import java.util.function.Supplier;

/**
 * A class that supplies UUID.
 *
 * @author saden
 */
public class RandomUuidSupplier implements Supplier<UUID> {

    @Override
    public UUID get() {
        return UUID.randomUUID();
    }

}
