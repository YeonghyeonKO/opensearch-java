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

package org.opensearch.client.opensearch._types;

import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import javax.annotation.Generated;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.json.PlainJsonSerializable;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;

// typedef: _types.LatLonGeoLocation

@JsonpDeserializable
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class LatLonGeoLocation implements PlainJsonSerializable {

    private final double lat;

    private final double lon;

    // ---------------------------------------------------------------------------------------------

    private LatLonGeoLocation(Builder builder) {
        this.lat = ApiTypeHelper.requireNonNull(builder.lat, this, "lat");
        this.lon = ApiTypeHelper.requireNonNull(builder.lon, this, "lon");
    }

    public static LatLonGeoLocation of(Function<LatLonGeoLocation.Builder, ObjectBuilder<LatLonGeoLocation>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Required - Latitude
     * <p>
     * API name: {@code lat}
     * </p>
     */
    public final double lat() {
        return this.lat;
    }

    /**
     * Required - Longitude
     * <p>
     * API name: {@code lon}
     * </p>
     */
    public final double lon() {
        return this.lon;
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
        generator.writeKey("lat");
        generator.write(this.lat);

        generator.writeKey("lon");
        generator.write(this.lon);
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link LatLonGeoLocation}.
     */
    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<LatLonGeoLocation> {
        private Double lat;
        private Double lon;

        /**
         * Required - Latitude
         * <p>
         * API name: {@code lat}
         * </p>
         */
        public final Builder lat(double value) {
            this.lat = value;
            return this;
        }

        /**
         * Required - Longitude
         * <p>
         * API name: {@code lon}
         * </p>
         */
        public final Builder lon(double value) {
            this.lon = value;
            return this;
        }

        /**
         * Builds a {@link LatLonGeoLocation}.
         *
         * @throws NullPointerException if some of the required fields are null.
         */
        public LatLonGeoLocation build() {
            _checkSingleUse();

            return new LatLonGeoLocation(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link LatLonGeoLocation}
     */
    public static final JsonpDeserializer<LatLonGeoLocation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        LatLonGeoLocation::setupLatLonGeoLocationDeserializer
    );

    protected static void setupLatLonGeoLocationDeserializer(ObjectDeserializer<LatLonGeoLocation.Builder> op) {
        op.add(Builder::lat, JsonpDeserializer.doubleDeserializer(), "lat");
        op.add(Builder::lon, JsonpDeserializer.doubleDeserializer(), "lon");
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Double.hashCode(this.lat);
        result = 31 * result + Double.hashCode(this.lon);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        LatLonGeoLocation other = (LatLonGeoLocation) o;
        return this.lat == other.lat && this.lon == other.lon;
    }
}
