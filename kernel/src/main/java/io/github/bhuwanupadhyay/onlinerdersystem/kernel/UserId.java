package io.github.bhuwanupadhyay.onlinerdersystem.kernel;

import java.util.Objects;

public class UserId {
    private final String userName;

    public UserId(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserId userId = (UserId) o;
        return Objects.equals(userName, userId.userName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userName);
    }
}
