package com.kwonyoon.springexample.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Point {
    int x;
    int y;
}