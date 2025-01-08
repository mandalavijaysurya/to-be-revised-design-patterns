package com.example.creational.builder.builders;

import com.example.creational.builder.models.manuals.Manual;

public interface CarManualBuilder extends Builder {
    Manual getResult();
}
