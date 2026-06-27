package org.example.uberprojectlocationservice.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaveDriverLocationRequestDto {
    String driverId;
    Double latitude;
    Double longitude;
}
