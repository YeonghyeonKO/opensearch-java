/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch._types.analysis;

import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.json.PlainJsonSerializable;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;

// typedef: _types.analysis.SimpleAnalyzer

@JsonpDeserializable
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class SimpleAnalyzer implements AnalyzerVariant, PlainJsonSerializable {

    @Nullable
    private final String version;

    // ---------------------------------------------------------------------------------------------

    private SimpleAnalyzer(Builder builder) {
        this.version = builder.version;
    }

    public static SimpleAnalyzer of(Function<SimpleAnalyzer.Builder, ObjectBuilder<SimpleAnalyzer>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * {@link Analyzer} variant kind.
     */
    @Override
    public Analyzer.Kind _analyzerKind() {
        return Analyzer.Kind.Simple;
    }

    /**
     * API name: {@code version}
     */
    @Nullable
    public final String version() {
        return this.version;
    }

    /**
     * Serialize this object to JSON.
     */
    @Override
    public void serialize(JsonGenerator generator, JsonpMapper mapper) {
        generator.writeStartObject();
        serializeInternal(generator, mapper);
        generator.writeEnd();
    }

    protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
        generator.write("type", "simple");
        if (this.version != null) {
            generator.writeKey("version");
            generator.write(this.version);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link SimpleAnalyzer}.
     */
    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SimpleAnalyzer> {
        @Nullable
        private String version;

        /**
         * API name: {@code version}
         */
        public final Builder version(@Nullable String value) {
            this.version = value;
            return this;
        }

        /**
         * Builds a {@link SimpleAnalyzer}.
         *
         * @throws NullPointerException if some of the required fields are null.
         */
        public SimpleAnalyzer build() {
            _checkSingleUse();

            return new SimpleAnalyzer(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link SimpleAnalyzer}
     */
    public static final JsonpDeserializer<SimpleAnalyzer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        SimpleAnalyzer::setupSimpleAnalyzerDeserializer
    );

    protected static void setupSimpleAnalyzerDeserializer(ObjectDeserializer<SimpleAnalyzer.Builder> op) {
        op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");

        op.ignore("type");
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Objects.hashCode(this.version);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        SimpleAnalyzer other = (SimpleAnalyzer) o;
        return Objects.equals(this.version, other.version);
    }
}
