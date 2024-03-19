package br.com.targettrust.snack.domain;

import br.com.targettrust.snack.enumerations.EnumMachineStatus;

import java.util.List;

public class SnackMachine {
    private List<Fileira> fileiras;

    private EnumMachineStatus status;

    private Long numeroMaximoFileiras;

    public SnackMachine(List<Fileira> fileiras, EnumMachineStatus status, Long numeroMaximoFileiras) {
        this.fileiras = fileiras;
        this.status = status;
        this.numeroMaximoFileiras = numeroMaximoFileiras;
    }

    public List<Fileira> getFileiras() {
        return fileiras;
    }

    public void setFileiras(List<Fileira> fileiras) {
        this.fileiras = fileiras;
    }

    public EnumMachineStatus getStatus() {
        return status;
    }

    public void setStatus(EnumMachineStatus status) {
        this.status = status;
    }

    public Long getNumeroMaximoFileiras() {
        return numeroMaximoFileiras;
    }

    public void setNumeroMaximoFileiras(Long numeroMaximoFileiras) {
        this.numeroMaximoFileiras = numeroMaximoFileiras;
    }

    @Override
    public String toString() {
        return "SnackMachine{" +
                "fileiras=" + fileiras +
                ", status=" + status +
                ", numeroMaximoFileiras=" + numeroMaximoFileiras +
                '}';
    }
}
