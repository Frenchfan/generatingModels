package org.example.generatingmodels.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о пользователе
 */
@lombok.Data, @lombok.AllArgsConstructor, @lombok.NoArgsConstructor

@Schema(name = "UserResponse", description = "Информация о пользователе")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-23T17:10:07.851185700+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class UserResponse {

  private UUID userId;

}

