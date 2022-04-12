import pytest


@pytest.mark.marker1
def greater_test():
    num = 100
    assert num > 100


@pytest.mark.marker2
def greater_eql():
    num = 100
    assert num >= 100
