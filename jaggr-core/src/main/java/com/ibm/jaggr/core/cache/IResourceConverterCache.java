/*
 * (C) Copyright IBM Corp. 2012, 2016 All Rights Reserved.
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
package com.ibm.jaggr.core.cache;

import com.ibm.jaggr.core.resource.IResource;

import java.io.IOException;

public interface IResourceConverterCache extends IGenericCache {
	/**
	 * Returns the cache file for the specified key. If the cache file does not exist, then a new
	 * cache file is created by calling the resource converter that was provided in the constructor
	 * for this cache instance with the specified source resource.
	 *
	 * @param key
	 *            the cache key
	 * @param source
	 *            the resource to be converted (may be null). If null, the result will be non-null
	 *            only if the cache entry already exists.
	 * @return the cached resource object, or null if {@code source} is null and the cache entry
	 *         does not already exist.
	 * @throws IOException
	 */
	IResource convert(String key, IResource source) throws IOException;
}
