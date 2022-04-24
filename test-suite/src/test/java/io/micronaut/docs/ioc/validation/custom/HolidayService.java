/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.docs.ioc.validation.custom;

import jakarta.inject.Singleton;
import javax.validation.constraints.NotBlank;
import java.time.Duration;

// tag::class[]
@Singleton
public class HolidayService {

    // tag::method[]
    public String startHoliday(@NotBlank String person,
                               @DurationPattern String duration) {
        final Duration d = Duration.parse(duration);
        return "Person " + person + " is off on holiday for " + d.toMinutes() + " minutes";
    }
    // end::method[]

    public String startHoliday(@DurationPattern String fromDuration, @DurationPattern String toDuration, @NotBlank String person
    ) {
        final Duration d = Duration.parse(fromDuration);
        final Duration e = Duration.parse(toDuration);
        return "Person " + person + " is off on holiday from " + d + " to " + e;
    }
}
// end::class[]
