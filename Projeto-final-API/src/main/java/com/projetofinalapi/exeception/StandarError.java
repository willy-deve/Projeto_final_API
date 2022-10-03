package com.projetofinalapi.exeception;

import java.time.Instant;
import java.util.Objects;

public class StandarError {

    private Instant timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandarError() {
    }

    public StandarError(Instant timestamp, Integer status, String error, String message, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StandarError that = (StandarError) o;
        return timestamp.equals(that.timestamp) && status.equals(that.status) && error.equals(that.error) && message.equals(that.message) && path.equals(that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, status, error, message, path);
    }
}
