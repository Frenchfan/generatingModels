package org.example.generatingmodels.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AccountsListResponseInner
 */
@lombok.Data, @lombok.AllArgsConstructor, @lombok.NoArgsConstructor

@JsonTypeName("AccountsListResponse_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-23T17:10:07.851185700+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AccountsListResponseInner {

  private UUID accountId;

  private String accountName;

  private BigDecimal amount;

}

