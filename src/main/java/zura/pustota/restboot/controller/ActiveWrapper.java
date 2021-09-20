package zura.pustota.restboot.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import zura.pustota.restboot.entity.Account;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ActiveWrapper {
    private Object account;
    private boolean active;
}
