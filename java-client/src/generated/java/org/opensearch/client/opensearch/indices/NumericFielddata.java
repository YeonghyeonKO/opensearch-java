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

package org.opensearch.client.opensearch.indices;

import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.json.PlainJsonSerializable;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;

// typedef: indices.NumericFielddata

@JsonpDeserializable
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class NumericFielddata implements PlainJsonSerializable {

    @Nonnull
    private final NumericFielddataFormat format;

    // ---------------------------------------------------------------------------------------------

    private NumericFielddata(Builder builder) {
        this.format = ApiTypeHelper.requireNonNull(builder.format, this, "format");
    }

    public static NumericFielddata of(Function<NumericFielddata.Builder, ObjectBuilder<NumericFielddata>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Required - API name: {@code format}
     */
    @Nonnull
    public final NumericFielddataFormat format() {
        return this.format;
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
        generator.writeKey("format");
        this.format.serialize(generator, mapper);
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link NumericFielddata}.
     */
    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NumericFielddata> {
        private NumericFielddataFormat format;

        /**
         * Required - API name: {@code format}
         */
        public final Builder format(NumericFielddataFormat value) {
            this.format = value;
            return this;
        }

        /**
         * Builds a {@link NumericFielddata}.
         *
         * @throws NullPointerException if some of the required fields are null.
         */
        public NumericFielddata build() {
            _checkSingleUse();

            return new NumericFielddata(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link NumericFielddata}
     */
    public static final JsonpDeserializer<NumericFielddata> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        NumericFielddata::setupNumericFielddataDeserializer
    );

    protected static void setupNumericFielddataDeserializer(ObjectDeserializer<NumericFielddata.Builder> op) {
        op.add(Builder::format, NumericFielddataFormat._DESERIALIZER, "format");
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.format.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        NumericFielddata other = (NumericFielddata) o;
        return this.format.equals(other.format);
    }
}
