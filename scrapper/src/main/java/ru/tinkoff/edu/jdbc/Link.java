package ru.tinkoff.edu.jdbc;

import java.net.URI;
import java.sql.Timestamp;

public record Link(
        Integer id,
        URI url,
        Timestamp updateTime
) {
}
