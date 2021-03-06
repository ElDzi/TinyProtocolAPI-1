package com.gmail.zahusek.tinyprotocolapi.listener;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.gmail.zahusek.tinyprotocolapi.element.PacketType;

@Target({TYPE})
@Retention(RUNTIME)
public @interface PacketID
{ PacketType id (); }