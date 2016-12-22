/*
 * Copyright 2016 Christoph Böhme
 *
 * Licensed under the Apache License, Version 2.0 the "License";
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
package org.culturegraph.mf.stream.converter.pojo;

import org.culturegraph.mf.framework.StreamReceiver;

/**
 * Use this interfaces to include a metafacture event stream to the pojo
 * decoder. If the {@link PojoDecoder} detects a type implementing this
 * interface, it will call the {@link #sendToStream} method.
 *
 * @author Thomas Seidel
 *
 */
public interface MetafactureSource {

	void sendToStream(final StreamReceiver streamReceiver);

}